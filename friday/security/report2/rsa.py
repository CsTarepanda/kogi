#!/usr/bin/python3
from random import shuffle as sf
def isprime(num):
    for i in range(2, int(num ** 0.5) + 1):
        if num % i == 0:
            return False
    return True

def pfac(num):
    result = []
    i = 2
    while num > 1:
        if isprime(i) and num % i == 0:
            result.append(i)
            num /= i
        else:
            i += 1
    return result

def lcm(pf1, pf2):
    ar = []
    for i in pf2:
        if i in pf1:
            pf1.remove(i)
            ar.append(i)
        else:
            ar.append(i)
    ar += pf1
    result = 1
    for i in ar:
        result *= i
    return result

def gcd(n1, n2):
    pf1 = pfac(n1) + [1]
    pf2 = pfac(n2) + [1]
    ar = []
    for i in pf2:
        if i in pf1:
            pf1.remove(i)
            ar.append(i)
    result = 1
    for i in ar:
        result *= i
    return result

# def hissand(n1, n2):
#     llen = len(str(n1))
#     tlen = llen + len(str(n2)) + 1
#     bar = "-" * (llen + 1)
#     ans = int(n1 / n2)
#     sans = str(ans)
#     target = tlen - len(sans) + 1
#     s = "%{}d\n".format(tlen) % ans
#     s += "%{}s".format(tlen) % bar
#     s += "\n%d)%d\n" % (n2, n1)
#     s += "%{}d\n".format(target) % (int(sans[0]) * n2)
#     divr = int(str())
#     print(s)

def hissanm(n1, n2):
    calcresult = n1*n2
    sn2 = str(n2)
    llen = len(str(calcresult))
    tllen = llen
    result = "  %{}d\n".format(llen) % n1
    result += "× %{}d\n".format(llen) % n2
    result += "-" * (tllen + 2)
    result += "\n"
    while sn2:
        result += "%{}d\n".format(llen + 2) % (n1 * int(sn2[-1]))
        sn2 = sn2[:-1]
        llen -= 1
    result += "-" * (tllen + 2)
    result += "\n%{}d\n".format(tllen + 2) % calcresult
    return result, calcresult

gakuseki = 115
# gakuseki = 114999

p = 19
q = 31
n = p*q
m = gakuseki % (n - 2) + 2

ln = lcm(pfac(p - 1), pfac(q - 1))

e = [x for x in range(2, ln + 1) if gcd(x, ln) == 1]
print(e)
sf(e)
e = e[0]
# e = 7

d = 1
while (d*e - 1) % ln: d += 1
print(d)

tmp = m
for i in range(d):
    hs, tmp = hissanm(tmp, m)
    print(hs)

c = m**e % n
hukugo = c**d % n
print(hukugo)

# hissand(132451, 589)
