# KNN implementation from scratch with iris dataset
Iris dataset URL https://archive.ics.uci.edu/dataset/53/iris
# Naive Bayes steps
- Separate the dataset by label.
- Calculate the mean and standard deviation for each attribute of each group.
- Use that mean and standard deviation to construct a normal distribution for each group.
- Use the normal distribution to predict the probability that a given data point would belong to that group.
- Pick the group with the highest probability.
## Keep in mind about Naive Bayes algorithm
NB assumes all variables in the dataset are independent of one another. (Generally not the case in real life) 
