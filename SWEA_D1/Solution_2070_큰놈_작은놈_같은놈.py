t = int(input())
for i in range(t):
    a = list(map(int,input().split(" ")))
    if a[0]> a[1] :
        print("#%d >"%(i+1))
    elif a[0] == a[1] :
        print("#%d ="%(i+1))
    else :
    	print("#%d <"%(i+1))