# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.user import User  # noqa: E501
from swagger_server.test import BaseTestCase


class TestUserController(BaseTestCase):
    """UserController integration test stubs"""

    def test_add_user(self):
        """Test case for add_user

        Добавить пользователя
        """
        body = User()
        data = dict(id=789,
                    email='email_example',
                    pass_hash=789,
                    robot_sn_hash=789)
        response = self.client.open(
            '/User',
            method='POST',
            data=json.dumps(body),
            data=data,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_user(self):
        """Test case for delete_user

        Удаление пользователя
        """
        headers = [('user_id', 'user_id_example')]
        response = self.client.open(
            '/User/deleteById/{userId}'.format(user_id=789),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_user_by_id(self):
        """Test case for get_user_by_id

        Поиск пользователя по ID
        """
        response = self.client.open(
            '/User/findById/{userId}'.format(user_id=789),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_user(self):
        """Test case for update_user

        Обновить пользвателя
        """
        response = self.client.open(
            '/User/UpdateById/{userId}'.format(user_id=789),
            method='PUT')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
