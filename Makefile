.PHONY: test js-deps install deploy clean

target/cljs-example-lib.jar: deps.edn pom.xml src/**/*
	clojure -A:jar

pom.xml: deps.edn
	clojure -Spom

src/deps.cljs: package.json
	clojure -A:js-deps

js-deps: src/deps.cljs

test:
	clojure -A:test

install: target/cljs-example-lib.jar
	clojure -A:install

deploy: target/cljs-example-lib.jar
	clojure -A:deploy

clean:
	rm -rf target