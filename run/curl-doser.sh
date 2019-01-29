#!/bin/sh
set -x
curl -v -X POST -H "Accept: application/json" -H "Content-type: application/json" 127.0.0.1:8080/doser/disambiguation/disambiguationWithoutCategories-collective -d @request.json
