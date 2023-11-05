left = open("firstnote.txt", 'w')
left.write("I hate you\n")
left.write("To be strong\n")
left.write("Never forget\n")
left.close()

rode = open("firstnote", 'r')
print(rode.read())
rode.close()

right = open("firstnote", 'a')
right.write("What more do you want\n")
right.close()

final = open("firstnote", 'r')
print(final.read())
final.close()

newfile = open("details.csv", 'w')
cand1 = "Mathew Ajayi, 221028, Economics"
cand2 = "Adewale Badmus, 220505, Statistics"
newfile.write(str(cand1)+"\n")
newfile.write(str(cand2))
newfile.close()

letter = open("details.csv", 'r')
print(letter.read())
letter.close()