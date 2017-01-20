#!/usr/bin/python3
def kakezan(n1, n2):
    calcresult = n1*n2
    sn2 = str(n2)
    llen = len(str(calcresult))
    tllen = llen
    result =  "  %{}d\n".format(llen) % n1
    result += "* %{}d\n".format(llen) % n2
    result += "-" * (tllen + 2)
    result += "\n"
    while sn2:
        result += "%{}d\n".format(llen + 2) % (n1 * int(sn2[-1]))
        sn2 = sn2[:-1]
        llen -= 1
    if len(str(n2)) > 1:
        result += "-" * (tllen + 2)
        result += "\n%{}d\n".format(tllen + 2) % calcresult
    return result, calcresult


def ruizyo(n1, n2):
    result = n1
    hissan_result = ""
    for i in range(n2 - 1):
        hs, val = kakezan(result, n1)
        result = val
        hissan_result += hs + "\n"
    return hissan_result, result


def warizan(n1, n2):
    res = n1 // n2
    sn1, sn2 = str(n1), str(n2)
    al = len(sn2) + len(sn1) + 1
    hres = "%{}d\n".format(len(sn1) + len(sn2) + 1) % res
    hres += "%{}s\n".format(al) % "".join(["-" for x in range(len(sn1) + 1)])
    hres += "%d)%d\n" % (n2, n1)
    sres = str(res)
    
    c = al - len(sres)
    mtg = sn1[:len(sn2)]
    count = len(sn2)
    hikires = 0
    count = 0
    fstg = sn1[:len(str(int(sres[0]) * int(n2)))]
    bstg = sn1[len(str(int(sres[0]) * int(n2))):]

    while sres:
        c += 1
        n = int(sres[0]) * int(n2)
        tg = int(mtg)

        hres += "%{}d\n".format(c) % n
        hres += "%{}s\n".format(c) % "".join(["-" for x in range(max(len(str(n)), len(mtg)))])
        sn1 = bstg
        hikires = int(fstg) - n
        hres += "%{}d\n".format(c) % hikires
        sres = sres[1:]
        try:
            mtg = str(hikires) + str(bstg)[0]
            fstg = mtg
            bstg = bstg[1:]
            count += 1
            hres += "%{}s\n".format(c + 1) % int(mtg)
        except: pass
    return hres, res


if __name__ == "__main__":
    hs, val = warizan(12710233464526340096, 589)
    hs, val = kakezan(12552, 50123)
    hs, val = ruizyo(5, 1)
    print(hs, 5**2)
