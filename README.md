# Advanced Spring Boot Tutorial: Dynamic Pricing Strategies

## Overview

Dive into advanced Spring Boot development with this tutorial! Learn how to implement dynamic pricing strategies for various products using Java 8 Functions. The project demonstrates the integration of the Function interface to handle diverse pricing scenarios, from regular to discounted products.

## Features

- *Dynamic Pricing Strategies*: Implement sophisticated pricing strategies based on different product types.
- *Java 8 Functions*: Leverage the power of Java 8 Functions to handle pricing logic dynamically.
- *Robust Spring Boot Application*: Build a strong Spring Boot application with features like dependency injection and dynamic strategy selection.

## Getting Started

Follow these steps to get the project up and running:

## Postman Request

### Method: POST
### URL: `localhost:8080/api/processPrice`
### Body:
```json
{
    "price": "100.0",
    "productType": "DISCOUNTED"
}

Response:
 Proccesed Price : 85.0

## Getting Started

Follow these steps to get the project up and running:

1. Clone the repository:
   ```bash
   git clone https://github.com/taregjava/PromoProductDiscount.git