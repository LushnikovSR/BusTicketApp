class BusRoute:
    id: int
    name: str
    capacity: int
    bus_stops: list

    def __init__(self, id, name, capacity, bus_stops):
        self.id = id
        self.name = name
        self.capacity = capacity
        self.bus_stops = bus_stops
