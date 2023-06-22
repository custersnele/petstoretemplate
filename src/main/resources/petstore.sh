#!/bin/bash
echo Enter port number:
read PORT
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
echo $'CONTROLE 1: OVERVIEW ITEMS\n'
curl -H Content-Type:application/json http://localhost:$PORT/petstore/items
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
echo $'CONTROLE 2: OVERVIEW ITEMS BY CATEGORY\n'
echo $'+++ CATEGORY: FISH\n'
curl -H Content-Type:application/json http://localhost:$PORT/petstore/items/findByCategory?category=FISH
echo $'\n+++ CATEGORY: DOGS\n'
curl -H Content-Type:application/json http://localhost:$PORT/petstore/items/findByCategory?category=DOGS
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
echo $'CONTROLE 3: UPDATE QUANTITY\n'
curl -H Content-Type:application/json -X PUT http://localhost:$PORT/petstore/items/EST-1/17
curl -H Content-Type:application/json -X PUT http://localhost:$PORT/petstore/items/EST-2/10
curl -H Content-Type:application/json -X PUT http://localhost:$PORT/petstore/items/EST-16/1
curl -H Content-Type:application/json -X PUT http://localhost:$PORT/petstore/items/EST-17/1
curl -H Content-Type:application/json -X PUT http://localhost:$PORT/petstore/items/EST-22/1
curl -H Content-Type:application/json -X PUT http://localhost:$PORT/petstore/items/EST-23/1
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
echo $'CONTROLE 4: CHECK ITEM QUANTITY\n'
curl -H Content-Type:application/json http://localhost:$PORT/petstore/items
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
echo $'CONTROLE 5: ORDER 1 INVALID EMAIL\n'
curl -d '{"name": "Nele Custers","email": "nele.custers.be","lines": [{"itemid": "EST-1","quantity": 3},{"itemid": "EST-2","quantity": 3}]}' -H Content-Type:application/json -X POST http://localhost:$PORT/petstore/orders
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
echo $'CONTROLE 6: ORDER 1 CREATED\n'
curl -d '{"name": "Nele Custers","email": "nele.custers@pxl.be","lines": [{"itemid": "EST-1","quantity": 3},{"itemid": "EST-2","quantity": 3}]}' -H Content-Type:application/json -X POST http://localhost:$PORT/petstore/orders
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
echo $'CONTROLE 7: ORDER 2 CREATED\n'
curl -d '{"name": "Tom Schuyten","email": "tom.schuyten@pxl.be","lines": [{"itemid": "EST-22","quantity": 1}]}' -H Content-Type:application/json -X POST http://localhost:$PORT/petstore/orders
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
echo $'CONTROLE 8: ORDER OUT OF STOCK\n'
curl -d '{"name": "Tom Schuyten","email": "tom.schuyten@pxl.be","lines": [{"itemid": "EST-1","quantity": 15}]}' -H Content-Type:application/json -X POST http://localhost:$PORT/petstore/orders
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
echo $'CONTROLE 9: SERVLET OUTPUT\n'
curl -H Content-Type:application/html -X GET http://localhost:$PORT/petstore/OrderOverview
echo $'\n+++++++++++++++++++++++++++++++++++++++++++++++++++\n'
