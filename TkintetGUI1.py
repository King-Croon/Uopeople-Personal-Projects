from tkinter import *

def call():
    msg = Label (window, text = "You pressed the button")
    msg.place(x=30, y= 40)
    button["bg"] = "green"
    button["fg"] = "white"
    #button["border"] = "purple"

window = Tk()
window.geometry("200x110")
button = Button(text="press me", command = call)
button.place(x = 200, y = 500, width= 300, height = 50)
window.mainloop()