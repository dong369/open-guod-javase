#!/usr/bin/env bash
docker run \
    --detach \
    --publish 10443:443 \
    --publish 10080:10080 \
    --publish 10022:22 \
    --name gitlab \
    --hostname 192.168.7.211:10080 \
    --env GITLAB_OMNIBUS_CONFIG="external_url 'http://192.168.7.211/'; gitlab_rails['lfs_enabled'] = true;" \
    --restart unless-stopped \
    --volume /opt/soft/gitlab/etc:/etc/gitlab \
    --volume /opt/soft/gitlab/log:/var/log/gitlab \
    --volume /opt/soft/gitlab/data:/var/opt/gitlab \
    --privileged=true \
    beginor/gitlab-ce:11.3.0-ce.0