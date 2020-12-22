#!/usr/bin/python3

from glob import glob as glob
import time
import os

# Config
input_string = 'polished_obsidian_brick'
output_string = 'fabric:red_sandstone'
file_extension = 'json'

# DO NOT EDIT BELOW THIS---------------------------------------------------------------------------

c_dir = glob('*.' + file_extension)

log = open('log.txt','a')

def p(txt):
    print(txt.strip())
    log.write(txt.strip() + '\n')
    return


for file in c_dir:

    os.rename(file, file + '_old')
    old_file = open(file + '_old','r')
    new_file = open(file,'w')

    p('opened file: ' + old_file.name)

    for line in old_file:

        new_line = line.replace(input_string, output_string)
        new_file.write(new_line)
        p('     wrote line: ' + new_line)

    p('closed file: ' + old_file.name)
    p('')
    old_file.close()
    os.remove(file + '_old')
    new_file.close()

    time.sleep(0.5)