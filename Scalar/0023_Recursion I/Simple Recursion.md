Recurrence relation for bar(x,y)
is

```
bar(x, y) = x + bar(x, y−1) = 2x + bar(x, y−2) = … = yx + bar(x, 0) = yx
```

That is bar(x,y)
returns the product of x and y

Now, recurrence relation for foo

is

```
foo(a, b) = a × foo(a, b−1) = a × a × foo(a, b−2) = … = ab × foo(a, 0) = ab × 1 = ab
```

The given code returns a^b^
