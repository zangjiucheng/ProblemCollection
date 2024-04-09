def convert(s: str, numRows: int) -> str:
    newS = ""
    LENGTH = len(s)
    pieceLENGTH = (numRows - 1) * 2
    if pieceLENGTH <= 1:
        pieceLENGTH = 1
    pieceList = []

    while s != "":
        piece = s[:pieceLENGTH]
        while len(piece) < pieceLENGTH:
            piece += "#"
        s = s[pieceLENGTH:]
        pieceList.append(piece)
    for x in range(numRows):
        try:
            if x == (numRows - 1) or x == 0:
                for y in range(len(pieceList)):
                    piece = pieceList[y]
                    newS += piece[0]
                    pieceList[y] = piece[1:]
            else:
                for y in range(len(pieceList)):
                    piece = pieceList[y]
                    newS += piece[0]
                    if len(piece) > 1:
                        newS += piece[-1]
                    pieceList[y] = piece[1:][:-1]
        except:
            pass

    return newS.replace("#", "")


print(convert("PAYPALISHIRING", 3))
