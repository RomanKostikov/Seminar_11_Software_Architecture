import connexion
import six

from swagger_server.models.group import Group  # noqa: E501
from swagger_server import util


def add_group(body):  # noqa: E501
    """Добавление группы

    Добавление группы в базу данных # noqa: E501

    :param body: Добавление группы в базу данных
    :type body: dict | bytes

    :rtype: Group
    """
    if connexion.request.is_json:
        body = Group.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_group(id, user_id):  # noqa: E501
    """Добавление группы

    Добавление группы в базу данных # noqa: E501

    :param id: 
    :type id: int
    :param user_id: 
    :type user_id: int

    :rtype: Group
    """
    return 'do some magic!'


def delete_group(group_id, group_id=None):  # noqa: E501
    """Удаление группы по ID

    Удаление группы в базе данных # noqa: E501

    :param group_id: ID - идентификатор группы
    :type group_id: int
    :param group_id: 
    :type group_id: str

    :rtype: None
    """
    return 'do some magic!'


def get_group_by_id(group_id):  # noqa: E501
    """Поиск группы по ID

    Поиск группы в базе данных # noqa: E501

    :param group_id: Поиск группы
    :type group_id: int

    :rtype: Group
    """
    return 'do some magic!'


def update_group(body):  # noqa: E501
    """Обновление группы пользователей

    Обновить группу пользователей # noqa: E501

    :param body: Обновление группы
    :type body: dict | bytes

    :rtype: Group
    """
    if connexion.request.is_json:
        body = Group.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_group(id, user_id):  # noqa: E501
    """Обновление группы пользователей

    Обновить группу пользователей # noqa: E501

    :param id: 
    :type id: int
    :param user_id: 
    :type user_id: int

    :rtype: Group
    """
    return 'do some magic!'
