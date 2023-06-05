from calculoImc.models.people import People
from calculoImc.services.calculateImc import getDescription
from flask import Flask, jsonify, request
from services.calculateImc import calculateImc

app = Flask(__name__) 
		
@app.route('/', methods=['GET']) 
def hello(): 
    return "Hello World!" 

@app.route('/imc/calculate', methods=['POST'])
def calculaImc():
    people = People.from_dict(request.json)
    calculateImc(people)
    getDescription(people)
    return jsonify(people.to_dict())

app.run(host='localhost', port='8080', debug=True)
