# coding: utf-8

from __future__ import absolute_import

from flask import json
from six import BytesIO

from swagger_server.models.robot import Robot  # noqa: E501
from swagger_server.test import BaseTestCase


class TestRobotController(BaseTestCase):
    """RobotController integration test stubs"""

    def test_add_robot(self):
        """Test case for add_robot

        Добавление робота-пылесоса
        """
        body = Robot()
        data = dict(id=789,
                    model='model_example',
                    version='version_example',
                    charge=789,
                    garbage_container=789,
                    robot_pollution=789,
                    next_service=789,
                    serial_number='serial_number_example',
                    ip_address=789,
                    group_id=789)
        response = self.client.open(
            '/Robot',
            method='POST',
            data=json.dumps(body),
            data=data,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_delete_robot(self):
        """Test case for delete_robot

        Удаление робота-пылесоса по ID
        """
        headers = [('robot_id', 'robot_id_example')]
        response = self.client.open(
            '/Robot/deleteById/{robotId}'.format(robot_id=789),
            method='DELETE',
            headers=headers)
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_get_robot_by_id(self):
        """Test case for get_robot_by_id

        Поиск робота-пылесоса по ID
        """
        response = self.client.open(
            '/Robot/robotById/{robotId}'.format(robot_id=789),
            method='GET')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))

    def test_update_robot(self):
        """Test case for update_robot

        Обновление робота-пылесоса
        """
        body = Robot()
        data = dict(id=789,
                    model='model_example',
                    version='version_example',
                    charge=789,
                    garbage_container=789,
                    robot_pollution=789,
                    next_service=789,
                    serial_number='serial_number_example',
                    ip_address=789,
                    group_id=789)
        response = self.client.open(
            '/Robot',
            method='PUT',
            data=json.dumps(body),
            data=data,
            content_type='application/json')
        self.assert200(response,
                       'Response body is : ' + response.data.decode('utf-8'))


if __name__ == '__main__':
    import unittest
    unittest.main()
