#Calculate the mean of values in each row.

data = {'X': [1, 2, 3], 'Y': [4, 5, 6]}
df = pd.DataFrame(data)
df.mean(axis=1)
