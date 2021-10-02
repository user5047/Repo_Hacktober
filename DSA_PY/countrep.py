def countrep(n):
    # used for finidng counts of a distinct character in a word
    counts = []
    for i in n:
        counts.append((i,n.count(i)))
    
    return counts