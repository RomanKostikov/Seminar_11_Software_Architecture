# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.group import Group  # noqa: E501
from swagger_server.test import BaseTestCase


class TestGroupController(BaseTestCase):
    """GroupController integration test stubs"""

    def test_add_group(self):
        """Test case for add_group

        Добавление группы
        """
        body = Group()
        data = dict(id=789,
                    user_id=789)
        response = self.client.open(
            '/Group',
            method='POST',
            data=json.dumps(body),
            data=data,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_group(self):
        """Test case for delete_group

        Удаление группы по ID
        """
        headers = [('group_id', 'group_id_example')]
        response = self.client.open(
            '/Group/deleteById/{groupId}'.format(group_id=789),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_group_by_id(self):
        """Test case for get_group_by_id

        Поиск группы по ID
        """
        response = self.client.open(
            '/Group/findById/{groupId}'.format(group_id=789),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_group(self):
        """Test case for update_group

        Обновление группы пользователей
        """
        body = Group()
        data = dict(id=789,
                    user_id=789)
        response = self.client.open(
            '/Group',
            method='PUT',
            data=json.dumps(body),
            data=data,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
