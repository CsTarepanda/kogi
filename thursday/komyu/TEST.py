import os
import time
for i in range(30):
    os.system("echo {}|xsel --clipboard --input".format(i))
    time.sleep(1)
