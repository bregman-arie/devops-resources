# Copyright 2018 Arie Bregman
#
#    Licensed under the Apache License, Version 2.0 (the "License"); you may
#    not use this file except in compliance with the License. You may obtain
#    a copy of the License at
#
#         http://www.apache.org/licenses/LICENSE-2.0
#
#    Unless required by applicable law or agreed to in writing, software
#    distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
#    WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
#    License for the specific language governing permissions and limitations
#    under the License.
import json
import requests
import sys

from notifier import parse

message = 'Build {}'.format('FAILED')

headers = {
    'Content-Type': 'application/json',
}

payload = {
    'message': message,
}

endpoint = ''


def main():
    """Main entry point."""

    # Parse given arguments
    parser = parse.create_parser()
    args = parser.parse_args()

    r = requests.post(endpoint,
                      data=json.dumps(payload + args),
                      headers=headers)
    print(r.status)


if __name__ == '__main__':
    sys.exit(main())
