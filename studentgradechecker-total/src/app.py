from flask import Flask
from flask import request
from flask import Response
import json

app = Flask(__name__)

@app.route("/")
def get_total():
    input_text = request.args.get('input_text')

    marks = parse_marks_from_input(input_text)

    total = calculate_total(marks)

    #Convert python to json
    x = {
    "answer": total
    }

    reply = json.dumps(x)
    r = Response (response=reply, status=200, mimetype="application/json")
    r.headers["Content-Type"]="application/json"
    r.headers["Access-Control-Allow-Origin"]="*"
    return r


def parse_marks_from_input(input_text):
    edited_input_text = input_text.replace("newline", ",")
    parsed_input_text = edited_input_text.split(",")
    marks = []
    
    for s in parsed_input_text:
        if s.isnumeric():
            marks.append(s)
    return marks


def calculate_total(marks):
    total = 0

    for mark in marks:
        total = total + int(mark)
    
    return total


if __name__ == '__main__':
    app.run(host="127.0.0.1", port=5000)
