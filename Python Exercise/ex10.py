tabby_cat = "\tI'm tabbed in."
persian_cat = "I'm split \non a line."
backslash_cat = "I'm \\ a \\ cat."

fat_cat = '''
I'll do a list:
\t* Cat food
\t* Fishes
\t* Catnip\n\t* Grass
'''

while True:
    for i in ["/", "-", "|", "\\", "|"]:
        print "%s\r" % i,

print tabby_cat
print persian_cat
print backslash_cat
print fat_cat
