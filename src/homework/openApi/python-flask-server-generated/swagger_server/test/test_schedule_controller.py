# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.schedule import Schedule  # noqa: E501
from swagger_server.test import BaseTestCase


class TestScheduleController(BaseTestCase):
    """ScheduleController integration test stubs"""

    def test_add_schedule(self):
        """Test case for add_schedule

        Добавление расписания
        """
        body = Schedule()
        data = dict(id=789,
                    date_time='date_time_example',
                    mode=789,
                    robot_id=789)
        response = self.client.open(
            '/Schedule',
            method='POST',
            data=json.dumps(body),
            data=data,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_schedule(self):
        """Test case for delete_schedule

        Удаление расписания по ID
        """
        headers = [('id', 'id_example')]
        response = self.client.open(
            '/Schedule/deleteById/{Id}'.format(id=789),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_schedule_by_id(self):
        """Test case for get_schedule_by_id

        Поиск расписания по ID
        """
        response = self.client.open(
            '/Schedule/findById/{Id}'.format(id=789),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_schedule(self):
        """Test case for update_schedule

        Обновление расписания уборки
        """
        body = Schedule()
        data = dict(id=789,
                    date_time='date_time_example',
                    mode=789,
                    robot_id=789)
        response = self.client.open(
            '/Schedule',
            method='PUT',
            data=json.dumps(body),
            data=data,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
