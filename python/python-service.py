#coding=utf-8
import json
from flask import Flask, Response
# -*- coding: utf-8 -*-
server = Flask(__name__)
@server.route("/health")
def health():
    result = {'status': 'UP'}
    return Response(json.dumps(result), mimetype='application/json')
@server.route("/getMsg")
def getMsg():
    result = {'msg':'spring cloud整合 python','msg_code':0}
    return Response(json.dumps(result), mimetype='application/json')
server.run(port=3000, host='0.0.0.0')