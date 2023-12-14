class BusStop:
    id: int
    name: str
    longitude: float
    latitude: float

    def __init__(self, id, name, longitude, latitude):
        self.id = id
        self.name = name
        self.longitude = longitude
        self.latitude = latitude
