field, step = {1:"C",2:"B",4:"A"}, 0
def p(n, frm, to):
    global step
    step += 1
    print("step%d)move %s from %s to %s" % (step, n, field[frm], field[to]))

def hanoi(n, frm, to):
    if n:
        els = ~(frm | to) & 7
        hanoi(n - 1, frm, els)
        p(n, frm, to)
        hanoi(n - 1, els, to)
        return step

print(hanoi(4, 4, 1))
