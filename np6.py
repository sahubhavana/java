#Reshape a DataFrame from long to wide format.
data = {'X': ['foo', 'foo', 'bar', 'bar'], 'Y': ['one', 'two', 'one', 'two'], 'Z': [1, 2, 3, 4]}
df = pd.DataFrame(data)
wide_df = df.pivot(index='X', columns='Y', values='Z')
print(wide_df) 
