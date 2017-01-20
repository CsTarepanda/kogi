#!/usr/bin/python3
from random import shuffle as sf
import hissan
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
    global ar
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
    while n2: n1, n2 = n2, n1 % n2
    return n1


def eval(gakuseki):
    # gakuseki = 115114
    # gakuseki = 114999

    p = 19
    q = 31
    n = p*q
    # print(p, "p")
    # print(q, "q")
    # print(n, "n")
    m = gakuseki % (n - 2) + 2

    ln = lcm(pfac(p - 1), pfac(q - 1))
    pfac18 = " \\times ".join(map(str, pfac(p - 1)))
    pfac30 = " \\times ".join(map(str, pfac(q - 1)))
    pfaclast = " \\times ".join(map(str, ar))

    # e = [x for x in range(ln + 1) if gcd(x, ln) == 1]
    gcdlist = [gcd(x, ln) for x in range(ln + 1)]
    e = [i for i, x in enumerate(gcdlist) if x == 1]
    es = ", ".join(map(str, e))
    gcdlist = "".join(["GCD(%d, \\lambda(n))&= %d\\\\\n" % (i, x) for i, x in enumerate(gcdlist)])
    gcdlist = gcdlist[:-3]
    # print(", ".join(map(str, e)), "eの候補")
    e = [x for x in e if 1 < x < 20]
    sf(e)
    e = e[0]
    # e = 7
    # print(e, "e")

    d = 1
    while (d*e - 1) % ln: d += 1
    de = d*e - 1
    # print(d, "d")

    # print(hs)
    # tmp = 333
    # for i in range(13):
    #     hs, tmp = hissan.kakezan(tmp, m)
    #     print(hs)

    c = m**e % n
    me = m**e
    hsk, val = hissan.ruizyo(m, e)
    hsd, val = hissan.warizan(me, n)

    hukugo = c**d % n
    nz = ""
    result = c
    for i in range(d):
        string = "$" + str(c) + "^{"+ str(i + 1) + "}$ = " + str(result)
        string = "\\\\".join([string[x*98:x*98 + 98] for x in range(len(string) // 98 + 1)])
        nz +=  (string[:-2] if string.endswith("\\\\") else string) + "\\\\\n"
        result *= c
    nzstr = str(result // c)
    nz += "$%s \\bmod 589 = %d$\n" % ("\\\\".join([nzstr[x*98:x*98 + 98] for x in range(len(nzstr) // 98 + 1)]), hukugo)
    cd = c**d
    # print(m**e, "m**e")
    # print(c**d, "c**d")
    # print(m, "平文")
    # print(c, "暗号")
    # print(hukugo, "復号")

    # hissand(132451, 589)
    return locals()
