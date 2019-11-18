a = int(input())
for i in range(a):
	b =list(map(int,input().split(" ")))
    
	print("#%d %d"%((i+1),round(sum(b)/10)))