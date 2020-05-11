---
layout: default
title: API Documentation
nav_order: 2
---

# API Documentation
{: .no_toc }

Here you can find information on how to use the FSS API.
---

# Changelog

All notable changes to this project will be documented in this file.

The format is based on [Keep a Changelog](https://keepachangelog.com/en/1.0.0/),
and this project adheres to [Semantic Versioning](https://semver.org/spec/v2.0.0.html).

## [10.0.0] - 2019-09-11
### Security
- Fix quadratic parse time for some combinations of pairs, #583. Algorithm is
  now similar to one in reference implementation.

### Changed
- Minor internal structs change, to make pairs parse more effective (cost is
  linear now). If you use external "pairs" extensions, you need sync those with
  "official ones". Without update, old code will work, but can cause invalid
  result in rare case. This is the only reason of major version bump. With high probability you don't need to change your code, only update version dependency.
- Updated changelog format.
- Deps bump.


## [9.1.0] - 2019-08-11
### Changed
- Remove extra characters from line break check. Leave only 0x0A & 0x0D, as in
  CommonMark spec, #581.


## [9.0.1] - 2019-07-12
### Fixed
- Fix possible corruption of open/close tag levels, #466


## [9.0.0] - 2019-07-09
### Changed
- Updated CM spec compatibility to 0.29.
- Update Travis-CI node version to actual (8 & latest).
- Deps bump.


## [8.4.2] - 2018-02-15
### Fixed
- Fix `--no-html` CLI option, #476.


## [8.4.1] - 2018-02-15
### Fixed
- Fix smartquotes around softbreaks, #430.
