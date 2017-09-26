def get_total_cost_of_meal():
    # original meal price
    meal_cost = float(input())
    # tip percentage
    tip_percent = int(input())
    # tax percentage
    tax_percent = int(input())

    # Write your calculation code here
    tip = meal_cost * tip_percent / 100
    tax = meal_cost * tax_percent / 100
    total_cost = meal_cost + tip + tax

    # cast the result of the rounding operation to an int and save it as total_cost
    total_cost = int(round(total_cost))

    return str(total_cost)


# Print your result
print("The total meal cost is " + get_total_cost_of_meal() + " dollars.")