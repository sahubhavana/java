def find_max(arr):
    maxi = arr[0]

    for num in arr:
        if num > maxi:
            maxi = num

    return maxi

print(find_max([5, 2, 9, 1, 7]))
