def convertion(tmp,units):
    if units == "C":
        f = (tmp*1.8) +32
        return f
    elif units == "F":
        c = (tmp-32)/1.8
        return c
