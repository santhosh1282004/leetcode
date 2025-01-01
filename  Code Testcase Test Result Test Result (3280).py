date="2080-02-29"
two = []
for i in date.split('-'):
    i = bin(int(i))[2:]
    two.append(i)
a='-'.join(two)
print(a)