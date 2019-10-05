# Questions

## 1. print odd number


	```bash
		for i in {1..99}
		do
		    
		    if (($i % 2 != 0))
		    then
		        echo "$i"
		    fi
		done

	```


## read user name
```
read name
echo "Welcome $name"

```

## Add numbers

```

read num1
read num2

sum=$(($num1+$num2))
sub=$(($num1-$num2))
mul=$(($num1*$num2))
div=$(($num1/$num2))
echo "$sum"
echo "$sub"
echo "$mul"
echo "$div"

```


```
read X
read Y

if (($X>$Y))
then
    echo "X is greater than Y"
elif ((($X<$Y)))
then 
    echo "X is less than Y"
else
    echo "X is equal to Y"
fi
```
