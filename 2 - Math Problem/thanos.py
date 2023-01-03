t = int(input())
for i in range(t):
    initial_pop, growth_rate, food_supply = map(int, input().split())
    new_pop = initial_pop
    num_years = 0
    while(new_pop <= food_supply):
        num_years += 1
        new_pop *= growth_rate
    print(num_years)
        