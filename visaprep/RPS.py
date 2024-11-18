def detwin(vignesh, charan):
    beats = {
        'R':'S',
        'S':'P',
        'P':'R'
    }
    if vignesh==charan:
        return "NULL"
    elif beats[vignesh]==charan:
        return "Vignesh"
    else:
        return "Charan"
vignesh, charan = input().split()
print(detwin(vignesh.upper(), charan.upper()))
