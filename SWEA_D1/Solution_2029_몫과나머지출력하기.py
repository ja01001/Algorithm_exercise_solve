T = int(input())
for i in range(T):
    a = list(map(int,input().split()))
    print("#%d %d %d"%(i+1,a[0]/a[1],a[0]%a[1]))