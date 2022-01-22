# Coding Problems Primer
Learn how to approach coding problems

## Prep for coding interviews
To get the most of this repository, navigate to [study guide](#Study Guide) before start solving issues.
Under main solution project there are a set of Java solutions for commonly asked interview coding problems. 
You can try to remove the code and write your own then run the tests. 
The purpose of this repo is not just for you to navigate through solutions and tests rather to apply what is being discussed in [study guide](#Study Guide) below and be able to tackle any problem with the right approach.

### How to navigate solution module
- Each package specifies the level of questions inside
- Each class contains different solutions for the same problem, and it has:
    - description
    - constrains
    - example input/output
    - time & space complexity
    - hints

## Study Guide
**What's an algorithm?**

A procedure to accomplish a specific task (transform a set of inputs into desired output).
<br/>

**What can we consider as an algorithmic problem?**

A problem that's specified by describing the complete set of instances it must work on.
<br/>

**Example on a well-defined algorithmic problem?**

Sorting: a sequence of `n` entries `X1, X2, ... Xn`, where the desired output is: `X1' <= X2' <= ... <= Xn'`

**Insertion sort**

![](solutions/src/main/resources/gifs/insertion-sort.gif)

[gif source](https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.pinterest.com%2Fpin%2F420734790180626311%2F&psig=AOvVaw0J8yT_py2zc_TNRdYbJMdZ&ust=1642943133849000&source=images&cd=vfe&ved=2ahUKEwiG8KagtsX1AhXDtKQKHVugCuwQr4kDegUIARDxAQ)

```java
class Solution{
    void insertion(int[] entries){
        for(int i =1; i < entries.length; i++){
            int j = i;
            while(j > 0 && entries[j] < entries[j-1]){
                int temp = entries[j];
                entries[j] = entries[j-1];
                entries[j-1] = temp;
                j--;
            }
        }
    }
}
```
<br/>

**Properties of a good algorithm?**
- Correct
- Efficient
- Easy to implement

****

## References
- [The Algorithm Design Manual | Third edition](https://www.amazon.de/Algorithm-Design-Manual-Computer-Science/dp/3030542556/ref=asc_df_3030542556/?tag=googshopde-21&linkCode=df0&hvadid=447482713157&hvpos=&hvnetw=g&hvrand=85054541206852219&hvpone=&hvptwo=&hvqmt=&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1004363&hvtargid=pla-927547030735&psc=1&th=1&psc=1) - Steven S.S
- https://leetcode.com/
- https://codeforces.com/
- https://www.hackerrank.com/

## Contact 
Feel free to contact me to discuss any issues, questions, or comments.
