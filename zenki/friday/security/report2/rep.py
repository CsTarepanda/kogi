#!/usr/bin/python3
import rsa
v = rsa.eval(115114)
print(v["e"])
report = open("./report/report.tex").read()
print(report\
        .replace("{", "{{")\
        .replace("}", "}}")\
        .replace("<", "{")\
        .replace(">", "}")\
        .format(
            gakuseki=v["gakuseki"],
            pfac18=v["pfac18"],
            pfac30=v["pfac30"],
            pfaclast=v["pfaclast"],
            gcdlist=v["gcdlist"],
            ln=v["ln"],
            es=v["es"],
            n=v["n"],
            m=v["m"],
            e=v["e"],
            d=v["d"],
            de=v["de"],
            c=v["c"],
            hsk=v["hsk"],
            hsd=v["hsd"],
            me=v["me"],
            hukugo=v["hukugo"],
            ruizyo=v["nz"]
            ), file=open("./report/TEST.tex", "w"))
