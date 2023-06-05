class People():
    def __init__(self, weight , height):
        self.weight = weight
        self.height = height
        self.imc = 0

    def from_dict(dictionary):
        weight = dictionary['weight']
        height = dictionary['height']

        people = People(weight, height)

        return people
    
    def to_dict(self):
        people = dict()
        people['weight'] = self.weight
        people['height'] = self.height
        people['imc'] = self.imc
       
        return people