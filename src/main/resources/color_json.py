#!/usr/bin/python3

import os
import time
from glob import glob as glob

# Config
input_color = 'polished_obsidian_brick'
output_colors = ['polished_granite_brick']
time_mult = 0.2     #Does not affect file deletion warning delay.
keep_old = True
ext = 'json'

# DO NOT EDIT THESE -------------------------------------------------------------------------------
__c_dir__ = glob('*' + input_color + '*.' + ext)
__files_generated__ = 0
__total_characters__ = 0
__files_deleted__ = 0
__log_file__ = open(str(__file__).replace('.py','') + '_log_' + str(time.time()) + '.txt','w')
# DO NOT EDIT THESE--------------------------------------------------------------------------------

# Logging Stuff------------------------------------------------------------------------------------

def plog(text):
    global __log_file__
    print(text.strip())
    __log_file__.write(text.strip() + '\n')
    return

def wait(secs):
    global time_mult
    time.sleep(secs * time_mult)
    return

# End Of Logging Stuff-----------------------------------------------------------------------------

plog('Started Color Json Generator...')
wait(2.5)

# File deletion warning
if not keep_old:
    plog('')
    plog('WARNING: keep_old = False, original template files WILL BE DELETED with this setting!')
    plog('you have 5 seconds before this program starts deleting files!')
    plog('')
    time.sleep(5)

for file in __c_dir__:

    plog('')
    plog('     Opened Template File: ' + file)
    wait(2.5)

    for color in output_colors:
        
        template = open(file,'r')

        new_file = open(template.name.replace(input_color, color),'w')

        __files_generated__ += 1
        plog('          Created File: ' + new_file.name)
        for line in template:

            # Write each line to file
            new_file.write(line.replace(input_color, color))

            # Log writes and total up characters written
            plog('               Wrote Line: ' + line.replace(input_color, color))
            __total_characters__ += len(line.replace(input_color, color))
        plog('               Finished Writing: ' + new_file.name)
        plog('')

        new_file.close()
        wait(0.25)

        template.close()

    if not keep_old:
        os.remove(file)
        __files_deleted__ += 1
        plog('     Deleted Original File: ' + file)
        plog('')

plog('')
plog('Color Json Generator Done...')
plog(str(__files_generated__) + ' Files Created...')
if not keep_old:
    plog(str(__files_deleted__) + ' Files Deleted...')
plog(str(__total_characters__) + ' Characters Written...')
__log_file__.close()
wait(10)