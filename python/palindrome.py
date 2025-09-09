word = str(input("Enter a word: ")).strip().replace(" ", "")
new_word = ""
count = len(word) - 1
for i in range(len(word)):
    if(word[i] == word[count]):
        new_word += word[i]
    count -=1
print("a palindrome!" if word == new_word else "not a palindrome!")