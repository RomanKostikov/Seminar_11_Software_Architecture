import connexion
import six

from swagger_server.models.schedule import Schedule  # noqa: E501
from swagger_server import util


def add_schedule(body):  # noqa: E501
    """Добавление расписания

    Добавление расписания в базу данных # noqa: E501

    :param body: Добавление расписания в базу данных
    :type body: dict | bytes

    :rtype: Schedule
    """
    if connexion.request.is_json:
        body = Schedule.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_schedule(id, date_time, mode, robot_id):  # noqa: E501
    """Добавление расписания

    Добавление расписания в базу данных # noqa: E501

    :param id: 
    :type id: int
    :param date_time: 
    :type date_time: str
    :param mode: 
    :type mode: int
    :param robot_id: 
    :type robot_id: int

    :rtype: Schedule
    """
    return 'do some magic!'


def delete_schedule(id, id=None):  # noqa: E501
    """Удаление расписания по ID

    Удаление расписания из базы данных # noqa: E501

    :param id: ID - идентификатор расписания
    :type id: int
    :param id: 
    :type id: str

    :rtype: None
    """
    return 'do some magic!'


def get_schedule_by_id(id):  # noqa: E501
    """Поиск расписания по ID

    Поиск расписания в базе данных # noqa: E501

    :param id: ID - идентификатор пользователя
    :type id: int

    :rtype: Schedule
    """
    return 'do some magic!'


def update_schedule(body):  # noqa: E501
    """Обновление расписания уборки

    Обновление расписания в базе данных # noqa: E501

    :param body: Обновление расписания в базе данных
    :type body: dict | bytes

    :rtype: Schedule
    """
    if connexion.request.is_json:
        body = Schedule.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_schedule(id, date_time, mode, robot_id):  # noqa: E501
    """Обновление расписания уборки

    Обновление расписания в базе данных # noqa: E501

    :param id: 
    :type id: int
    :param date_time: 
    :type date_time: str
    :param mode: 
    :type mode: int
    :param robot_id: 
    :type robot_id: int

    :rtype: Schedule
    """
    return 'do some magic!'
