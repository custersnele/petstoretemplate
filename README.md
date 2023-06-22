# Java Petstore API

## 1. H2 database

http://localhost:8080/petstore/h2-console

database url and credentials can be found in `appplication.properties`.

## 2. API documentation

### Get list of all pets

#### Request

`GET /petstore/items/`

    e.g. http://localhost:8080/petstore/items

#### Response

    200 OK
    Content-Type: application/json

    [
        {
            "itemid": "EST-1",
            "productid": "FI-SW-01",
            "category": "FISH",
            "productName": "Angelfish",
            "productDescription": "Salt Water fish from Australia",
            "price": 16.5,
            "specification": "Large"
        },
        {
            "itemid": "EST-2",
            "productid": "FI-SW-01",
            "category": "FISH",
            "productName": "Angelfish",
            "productDescription": "Salt Water fish from Australia",
            "price": 15.5,
            "specification": "Small"
        },
        {
            "itemid": "EST-16",
            "productid": "FL-DLH-02",
            "category": "CATS",
            "productName": "Persian",
            "productDescription": "Friendly house cat, doubles as a princess",
            "price": 93.5,
            "specification": "Adult Female"
        },
        {
            "itemid": "EST-17",
            "productid": "FL-DLH-02",
            "category": "CATS",
            "productName": "Persian",
            "productDescription": "Friendly house cat, doubles as a princess",
            "price": 93.5,
            "specification": "Adult Male"
        },
        {
            "itemid": "EST-22",
            "productid": "K9-PO-02",
            "category": "DOGS",
            "productName": "Poodle",
            "productDescription": "Cute dog from France",
            "price": 135.5,
            "specification": "Adult Male"
        },
        {
            "itemid": "EST-23",
            "productid": "K9-PO-02",
            "category": "DOGS",
            "productName": "Poodle",
            "productDescription": "Cute dog from France",
            "price": 145.49,
            "specification": "Adult Female"
        }
    ]

### Get list of all pets by product category

#### Request

`GET /petstore/items/findByCategory?category={category}`

    e.g. http://localhost:8080/petstore/items/findByCategory?category=FISH

#### Response

    200 OK
    Content-Type: application/json

    [
        {
            "itemid": "EST-1",
            "productid": "FI-SW-01",
            "category": "FISH",
            "productName": "Angelfish",
            "productDescription": "Salt Water fish from Australia",
            "price": 16.5,
            "specification": "Large"
        },
        {
            "itemid": "EST-2",
            "productid": "FI-SW-01",
            "category": "FISH",
            "productName": "Angelfish",
            "productDescription": "Salt Water fish from Australia",
            "price": 15.5,
            "specification": "Small"
        }
    ]

### Update item quantity

#### Request

`PUT /petstore/items/{itemId}/{quantity}`

    e.g. http://localhost:8080/petstore/items/EST-1/8

#### Response

    202 ACCEPTED


### Create an order

#### Request

`POST /petstore/orders`


    {
        "name": "Nele Custers",
        "email": "nele.custers@pxl.be",
        "lines": [
           {
              "itemid": "EST-1",
              "quantity": 3
           },
           {
              "itemid": "EST-2",
              "quantity": 3
           }
        ]
    }

#### Response

    201 Created


## 3. Expected script output (petstore.sh)

```
Enter port number:
8080
+++++++++++++++++++++++++++++++++++++++++++++++++++
CONTROLE 1: OVERVIEW ITEMS
[{"itemid":"EST-1","productid":"FI-SW-01","category":"FISH","productName":"Angelfish","productDescription":"Salt Water fish from Australia","price":16.5,"specification":"Large","quantity":0},
{"itemid":"EST-2","productid":"FI-SW-01","category":"FISH","productName":"Angelfish","productDescription":"Salt Water fish from Australia","price":15.5,"specification":"Small","quantity":0},
{"itemid":"EST-16","productid":"FL-DLH-02","category":"CATS","productName":"Persian","productDescription":"Friendly house cat, doubles as a princess","price":93.5,"specification":"Adult Female","quantity":0},
{"itemid":"EST-17","productid":"FL-DLH-02","category":"CATS","productName":"Persian","productDescription":"Friendly house cat, doubles as a princess","price":93.5,"specification":"Adult Male","quantity":0},
{"itemid":"EST-22","productid":"K9-PO-02","category":"DOGS","productName":"Poodle","productDescription":"Cute dog from France","price":135.5,"specification":"Adult Male","quantity":0},
{"itemid":"EST-23","productid":"K9-PO-02","category":"DOGS","productName":"Poodle","productDescription":"Cute dog from France","price":145.49,"specification":"Adult Female","quantity":0}]
+++++++++++++++++++++++++++++++++++++++++++++++++++
CONTROLE 2: OVERVIEW ITEMS BY CATEGORY
+++ CATEGORY: FISH
[{"itemid":"EST-1","productid":"FI-SW-01","category":"FISH","productName":"Angelfish","productDescription":"Salt Water fish from Australia","price":16.5,"specification":"Large","quantity":0},
{"itemid":"EST-2","productid":"FI-SW-01","category":"FISH","productName":"Angelfish","productDescription":"Salt Water fish from Australia","price":15.5,"specification":"Small","quantity":0}]
+++ CATEGORY: DOGS
[{"itemid":"EST-22","productid":"K9-PO-02","category":"DOGS","productName":"Poodle","productDescription":"Cute dog from France","price":135.5,"specification":"Adult Male","quantity":0},
{"itemid":"EST-23","productid":"K9-PO-02","category":"DOGS","productName":"Poodle","productDescription":"Cute dog from France","price":145.49,"specification":"Adult Female","quantity":0}]
+++++++++++++++++++++++++++++++++++++++++++++++++++
CONTROLE 3: UPDATE QUANTITY
+++++++++++++++++++++++++++++++++++++++++++++++++++
CONTROLE 4: CHECK ITEM QUANTITY
[{"itemid":"EST-1","productid":"FI-SW-01","category":"FISH","productName":"Angelfish","productDescription":"Salt Water fish from Australia","price":16.5,"specification":"Large","quantity":17},
{"itemid":"EST-2","productid":"FI-SW-01","category":"FISH","productName":"Angelfish","productDescription":"Salt Water fish from Australia","price":15.5,"specification":"Small","quantity":10},
{"itemid":"EST-16","productid":"FL-DLH-02","category":"CATS","productName":"Persian","productDescription":"Friendly house cat, doubles as a princess","price":93.5,"specification":"Adult Female","quantity":1},
{"itemid":"EST-17","productid":"FL-DLH-02","category":"CATS","productName":"Persian","productDescription":"Friendly house cat, doubles as a princess","price":93.5,"specification":"Adult Male","quantity":1},
{"itemid":"EST-22","productid":"K9-PO-02","category":"DOGS","productName":"Poodle","productDescription":"Cute dog from France","price":135.5,"specification":"Adult Male","quantity":1},
{"itemid":"EST-23","productid":"K9-PO-02","category":"DOGS","productName":"Poodle","productDescription":"Cute dog from France","price":145.49,"specification":"Adult Female","quantity":1}]
+++++++++++++++++++++++++++++++++++++++++++++++++++
CONTROLE 5: ORDER 1 INVALID EMAIL
{"timestamp":"2023-06-22T19:06:42.467+00:00","status":400,"error":"Bad Request","message":"Validation failed for object='orderRequest'. Error count: 1","path":"/petstore/orders"}
+++++++++++++++++++++++++++++++++++++++++++++++++++
CONTROLE 6: ORDER 1 CREATED
+++++++++++++++++++++++++++++++++++++++++++++++++++
CONTROLE 7: ORDER 2 CREATED
+++++++++++++++++++++++++++++++++++++++++++++++++++
CONTROLE 8: ORDER OUT OF STOCK
{"timestamp":"2023-06-22T19:06:42.561+00:00","status":400,"error":"Bad Request","message":"Item [EST-1] is out of stock","path":"/petstore/orders"}
+++++++++++++++++++++++++++++++++++++++++++++++++++
CONTROLE 9: SERVLET OUTPUT
<html><head><title>Orders</title></head><body>
<hr/>
<div class="row">
Nele Custers (nele.custers@pxl.be)
</div>
<div class="row">
3 X Angelfish (Large)
</div>
<div class="row">
3 X Angelfish (Small)
</div>
<div class="row">Total:
96.0
</div>
<hr/>
<div class="row">
Tom Schuyten (tom.schuyten@pxl.be)
</div>
<div class="row">
1 X Poodle (Adult Male)
</div>
<div class="row">Total:
135.5
</div>
</body></html>
+++++++++++++++++++++++++++++++++++++++++++++++++++
```
