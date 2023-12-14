class Ticket:
    price: float
    date: datetime
    start_zone: int
    finish_zone: int
    is_luggage: bool
    place: int
    road_number: int

    def __init__(self, price, date, start_zone, finish_zone, is_luggage, place, road_number):
        self.price = price
        self.date = date
        self.start_zone = start_zone
        self.finish_zone = finish_zone
        self.is_luggage = is_luggage
        self.place = place
        self.road_number = road_number
