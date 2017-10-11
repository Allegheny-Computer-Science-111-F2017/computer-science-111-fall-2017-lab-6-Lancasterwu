# Reflection by Lancaster Wu

This lab required me to write a file called `ManipulateDNA`. The purpose of
this lab is to learn how to use `random int` to program. The output should have
my name and the date, the short discription to the input DNA string.Then the
output need a complement of the input DNA String, a new DNA String which has a
inserted randomly chosen DNA letter, a new DNA String which has a randomly
deleted DNA letter, a new DNA String which as a DNA letter changed randomly to
another DNA letter, and a `Thanks` comment at the end.

I was struggled with how to replace the complement letter at first, then I
realize that I can keep input in the lowercase and the complement in the
uppercase, and replace each letter step by step. I was then struggled with the
radom generator. I tried many times but somehow the `gradle run` would not show
me the output. By checking my codes sentence by sentence, I found that I did
not import the `java.util.Random;` before I use `Random generator`. Everything
works fine after I solve this problem.

For the deleting DNA letter String, I did not know how can I code the string,
so I searched online and used `strWithoutChar = new
StringBuilder(yourString).deleteCharAt(yourIndex).toString();`. The class
`StrungBuilder` is not what we learned in class, so I asked Professor
Kapfhammer for the way we suppose to know by using what we learned in class. I
soon realize it is the same to the `str.substring` code I used for inserting
DNA letter String.Also, I learned that for better format of coding, I should
use `str.length` instead of specific number for the input we have already, then
this program can also be used on other inputs with out error.

