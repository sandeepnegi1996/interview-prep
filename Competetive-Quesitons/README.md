# Competetive Coding(CP)

## Beginnning with the Bang

## Rules:-
    * Daily 2 coding problems or one 
    * Read someone else solution
    * implement Algorithm
    * implement DataStructure

#### I will make sure i will face the coding every single day

##### My Learnings:-


#### Ques1. check palindrome of a given string

1. get the string input put the string in string buffer and then apply the reverse function
and then use equals method to check whether both are equal or not 

```java

        StringBuffer str=new StringBuffer();
        str.append(s1);
        System.out.println(str);

         str.reverse();
         
         String s2=str.toString();
         System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("palindrome");
            
        } else {
            System.out.println("not palindrome");
        }
```

2. second approach to solve this problem is compare first with the last and then increae the start
and decrease the last if this occur flawlessly than its cool otherwise it is not a palindrome

```java
 public static void secondApproach(String s){
        int start=0;
        int end=s.length()-1;
        int flag=0;
        while (start<end) {
            if (s.charAt(start)==s.charAt(end)) {
                start++;
                end--;
                
            } else {
                flag=1;
                break;
            }   
            
        }
        if (flag==0) {
            System.out.println(" palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
```

#### Ques2. Reversing the string 
 1. **reversing iteratively** traverse the string from reverse and add each element from the reverse to a new string
```java
  public static void stringReverseIterative(String s){
        String s1="";
        
        for (int i = s.length()-1; i >=0 ; i--) 
            s1+=s.charAt(i);
        
        System.out.println(s1);

    }

```
 2. **Reversing recursively** take last character and again call the funtion with smaller string
```java
public static String stringReverseRecursively(String s){

        if (s.isEmpty() || s==null) 
            return s;
            
        return s.charAt(s.length()-1)+stringReverseRecursively(s.substring(0, s.length()-1));
    }
```


#### Ques3.Write a Java Program to swap two numbers without using the third variable.
    * Solution. store the multiplication of both the number in a and then to find b divide a*b/b this will give a put this is b

```java
    public static void swapWithoutTemp(int a,int b){
        a=a*b;
        b=a/b;
        a=a/b;

        System.out.println(a+" "+b);
    }
```

#### Ques4. count number of words in a string
    * Approach 1. by converting the string to char Array then comparing each array element with the ' ' 
    i have count the spaces and then returned with an increment to give the words

```java
      public static void countWords(String str){
        char arr[]=str.toCharArray();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==' ') {
                count++;
            }
            
        }
        System.out.println(++count);
        

    }
```

#### Ques4. frequency of each character in a string
    *Solution :- use hashmap key will be character and value will be count of each
                so we check whether character is present or not if it is not present 
                put the char in the hashmap with key value to be 1 if it is present get the value
                corresponding to the key and add one in the value and put in the hashmap

    ```java
     public static void countAlphabetFrequency(String str){
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();

        for (int i = 0; i < str.length(); i++) {
            
            char letter=str.charAt(i);
            int count=0;
            if (map.containsKey(letter)) {
                count=map.get(letter);
                ++count;
                map.put(letter, count);
            }
            else{
                map.put(letter, 1);
            }
            
        }
        for (Map.Entry element : map.entrySet()) {
            System.out.println(element.getKey()+" "+element.getValue());
        }
        
    }
    ```

#### ques5. nth fibonacchi

#### Ques7. Array sum of two elements

#### Ques 8. Reverse a number and check palindrome
    Solution. remainder will be num%10 and num/10 will decrease the num size
```java
 public static boolean checkPalindromeNum(int n){
        int rev=0;int rem=0;
        int originalNum=n;
        while (n>0) {
            rem=0;
            rem=n%10;
            rev=rem+rev*10;
            n/=10;
            
        }
        if (originalNum==rev) {
            return true;
            
        } else {
            return false;
        }

    }
```

#### Ques 9. Program to print fibonacci series
    * using memorization we will be storing the previous results in the array

```java
 public static void fibonacciMemorization(int first,int second,int n){

        
        int arr[]=new int[n];
        arr[0]=first;
        arr[1]=second;

        for (int i = 2; i < n; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
            
        }
    } 
```

#### Ques 10. Different ways to print arraylist

```java
  ArrayList list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        Iterator itr= list.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");         
        }
        System.out.println();
        for (Object obj : list) {
            System.out.print(obj+" ");
            
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));          
        }

```


#### Q #11 Write a Java Program to find the duplicate characters in a string.
####  **important** Q #12) Write a Java Program to find the kth highest largest or kth smaller in an array.
    * brute force :- approach second min should be greater than the first min and and third min should be greater than the second and third min
    
```java
    
    public static void kthSmallestBruteForce(int arr[],int k)
    {
        // // Todo: first find the first minimum
        int min=Integer.MAX_VALUE;
        int min1=Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min1){
                min1=arr[i];

            }

        }
        int min2=Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<min2  && arr[i]>min1) {
                min2=arr[i];
            
            }
            
        }
        System.out.println(min1 +" "+min2);
    }
    ```
#### Q #13) Factorial