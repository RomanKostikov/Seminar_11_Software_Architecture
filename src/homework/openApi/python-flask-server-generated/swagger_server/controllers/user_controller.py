import connexion
import six

from swagger_server.models.user import User  # noqa: E501
from swagger_server import util


def add_user(body):  # noqa: E501
    """Добавить пользователя

    Добавить пользователя в базу # noqa: E501

    :param body: Создание нового пользователя в базе
    :type body: dict | bytes

    :rtype: User
    """
    if connexion.request.is_json:
        body = User.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def add_user(id, email, pass_hash, robot_sn_hash):  # noqa: E501
    """Добавить пользователя

    Добавить пользователя в базу # noqa: E501

    :param id: 
    :type id: int
    :param email: 
    :type email: str
    :param pass_hash: 
    :type pass_hash: int
    :param robot_sn_hash: 
    :type robot_sn_hash: int

    :rtype: User
    """
    return 'do some magic!'


def delete_user(user_id, user_id=None):  # noqa: E501
    """Удаление пользователя

    Удаление пользователя и базы данных # noqa: E501

    :param user_id: ID пользователя
    :type user_id: int
    :param user_id: 
    :type user_id: str

    :rtype: None
    """
    return 'do some magic!'


def get_user_by_id(user_id):  # noqa: E501
    """Поиск пользователя по ID

    Поиск пользователя в базе # noqa: E501

    :param user_id: Идентификатор пользователя
    :type user_id: int

    :rtype: User
    """
    return 'do some magic!'


def update_user(user_id):  # noqa: E501
    """Обновить пользвателя

    Обновить пользователя в базе # noqa: E501

    :param user_id: Идентификатор пользователя
    :type user_id: int

    :rtype: User
    """
    return 'do some magic!'
