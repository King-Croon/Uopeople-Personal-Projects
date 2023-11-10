from array import *
arr_1 = list()
arr_2 = list()

arr_1 = [' ','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']

arr_2 = [' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z']

def encode(param,param1):
    w_list = list()
    f_list = list()
    l_msg = len(param)
    n = 0
    while n<l_msg:
        n_val = param[n]
        w_list.append(n_val)
        n = n+1
    #print(w_list)
    counter = 0
    
    if param.isupper() == False:
        try:
            for x in w_list:
                new_val = arr_1.index(x)
                f_list.append(arr_1[new_val+param1])
        except:
            b = 27 - new_val
            new_val = arr_1.index(x)
            if b == 0 and  b < param1:
                f_list.append(arr_1[param1])
            else:
                f_list.append(arr_1[param1-b])
      
    else:
          try:
              for x in w_list:
                  new_val = arr_2.index(x)
                  f_list.append(arr_1[new_val+param1])
          except:
              b = 27 - new_val
              new_val = arr_1.index(x)
              if b == 0 and b < param1:
                  f_list.append(arr_2[param1])
                  
              else:
                  f_list.append(arr_2[param1-b])
          
          
  
            
            
    print('--'*30)
    print('Your code is:  ' + ''.join(f_list))



#Orgin function -starting point
def origin():
    num = "1) Make a code\n 2) Decode a message\n 3) Quite"
    print(num + "\n")
    option = int(input("Enter your selections:\n"))
    
    if option == 1:
       msg = input("your message:\n")
       val_1 = int(input("input shift number\n"))
       encode(msg,val_1)
       
       print("\n")
       print('--'*30)
       print("\n")
       origin()
       
    elif option == 2:
        msg = input("Type encoded message\n")
        val_1 = int(input("shift number\n"))
        
    else:
        print("Quit: y or n")
        resp = input('\n')
        
        if resp == 'y':
            print('end')
        
        else:
            origin()
        
        
#Invocation        
origin()