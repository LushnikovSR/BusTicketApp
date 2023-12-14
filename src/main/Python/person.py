class Person:
    id: int
    fio: str
    card_number: long
    hash_pass: long
    login: str

    def __init__(self, id, fio, card_number, hash_pass, login):
        self._id = id
        self._fio = fio
        self._card_number = card_number
        self._hash_pass = hash_pass
        self._login = login

    @property
    def id(self):
        return self._id

    @property
    def fio(self):
        return self._fio

    @property
    def hash_pass(self):
        return self._hash_pass

    @hash_pass.setter
    def hash_pass(self, hash_pass):
        self._hash_pass = hash_pass

    @property
    def login(self):
        return self._login

    @login.setter
    def login(self, login):
        self._login = login
